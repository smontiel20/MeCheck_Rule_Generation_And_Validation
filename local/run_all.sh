#!/usr/bin/env bash
set -euo pipefail

# ===== 基础设置 =====
# 模板 notebook
INPUT_NB="${INPUT_NB:-template.ipynb}"
# 三列: FRAMEWORK,SOURCE,TOPIC
CSV_FILE="${CSV_FILE:-input_fsource.csv}"
# 生成的 .ipynb 输出目录
OUT_DIR="${OUT_DIR:-runs}"
KERNEL_NAME="${KERNEL_NAME:-python3}"
# papermill 使用的 python
PYTHON_BIN="${PYTHON_BIN:-python}"
# 所有产物的根目录
ARTIFACTS_ROOT="${ARTIFACTS_ROOT:-artifacts}"

export PYTHONIOENCODING=UTF-8
mkdir -p "$OUT_DIR" "$ARTIFACTS_ROOT"

"$PYTHON_BIN" - <<'PY'
import csv, os, subprocess, shlex, re, pathlib

INPUT_NB = os.environ.get("INPUT_NB", "template.ipynb")
CSV_FILE = os.environ.get("CSV_FILE", "input_fsource.csv")
OUT_DIR  = os.environ.get("OUT_DIR", "runs")
KERNEL   = os.environ.get("KERNEL_NAME", "python3")
ARTIFACTS_ROOT = os.environ.get("ARTIFACTS_ROOT", "artifacts")

def slug(s, maxlen=80):
    s = re.sub(r'\s+', '_', s or '')
    s = re.sub(r'[^A-Za-z0-9._-]', '', s)
    return (s or "run")[:maxlen]

with open(CSV_FILE, newline='', encoding='utf-8') as f:
    reader = csv.DictReader(f)
    i = 0
    for row in reader:
        i += 1
        fw  = (row.get("FRAMEWORK") or "").strip()
        src = (row.get("SOURCE") or "").strip()
        top = (row.get("TOPIC") or "").strip()

        topic_slug = slug(top)
        artifacts_dir = os.path.join(ARTIFACTS_ROOT, topic_slug)
        pathlib.Path(artifacts_dir).mkdir(parents=True, exist_ok=True)

        out_nb = os.path.join(OUT_DIR, f"{i:02d}-{slug(fw)}-{slug(top)}.ipynb")

        cmd = [
            "papermill",
            "--kernel", KERNEL,
            INPUT_NB, out_nb,
            "-p", "FRAMEWORK", fw,
            "-p", "SOURCE", src,
            "-p", "TOPIC", top,
            "-p", "OUT_DIR", os.path.abspath(OUT_DIR),
            "-p", "ARTIFACTS_DIR", os.path.abspath(artifacts_dir),
        ]

        print("→", " ".join(shlex.quote(c) for c in cmd), flush=True)
        subprocess.run(cmd, check=True)
PY
