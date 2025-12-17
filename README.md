# 📘 MeCheck Engine Extended – with new GPT-4-generated-then-human-modified rules and an LLM-powered rule generation/validation pipeline

This repository is an enhanced duplicate of the original **MeCheck** engine, available at:  
🔗 https://zenodo.org/records/15205192

We extend the MeCheck framework by adding:

- New rules  
- Additional code snippet datasets  
- A Bash-based pipeline implementation under `MeCheck_GPT_Rule_Generation/`

---

## 🚀 Project Structure

### `MeCheck_GPT_Rule_Generation/`

This directory contains our pipeline implementation, including:

- Pipeline logic  
- Supporting utilities using GPT models and SerpAPI

➡️ Inside this directory, see the `README/` folder for instructions on how to run the full pipeline.

---

### 📂 `artifact-submission/`

This folder contains newly created rule directories, organized by library or framework.  
Each subfolder includes:

- The rule definition  
- Supporting metadata  
- Any additional files needed for MeCheck to evaluate that rule  

---

### 📂 `dataset/`

This directory is organized to correspond to the structure of artifact-submission and provides: 

- Code snippet collections used to test each library/framework  
- Coverage examples for validating rule behavior  

Each dataset folder corresponds directly to a rule folder in `artifact-submission/`.

---

### 📂 `output/`

When rules are executed in the current implementation, their results are written here:

- Rule evaluation outputs containing reports of running each rule with code snippets of correct and incorrect cases

This folder helps track the outcome of running each of the generated rules.

---

## 🧠 Summary

This repository extends the original MeCheck engine.
Point of Contact: yeana at vt dot edu

- New rules  
- Framework-specific datasets  
- A runnable rule-generation and evaluation pipeline  

Please check the `MeCheck_GPT_Rule_Generation/README/` folder for detailed execution instructions.
