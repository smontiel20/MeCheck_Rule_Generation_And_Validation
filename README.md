# 📘 MeCheck Extended Engine – GPT Rule Generation Pipeline

This repository is an enhanced duplicate of the original **MeCheck** engine, available at:  
🔗 https://zenodo.org/records/15205192

We extend the MeCheck framework by adding:

- ✨ New analysis rules  
- ✨ Additional code snippet datasets  
- ✨ A Bash-based pipeline implementation under `MeCheck_GPT_Rule_Generation/`

---

## 🚀 Project Structure

### 📂 `MeCheck_GPT_Rule_Generation/`

This directory contains our pipeline implementation, including:

- End-to-end scripts  
- Pipeline logic  
- Supporting utilities  

➡️ Inside this directory, see the `README/` folder for instructions on how to run the full pipeline.

---

### 📂 `artifact-submission/`

This folder contains newly created rule directories, organized by library or framework.  
Each subfolder includes:

- 📘 The rule definition  
- 🧩 Supporting metadata  
- 🔧 Any additional files needed for MeCheck to evaluate that rule  

---

### 📂 `dataset/`

This directory mirrors the structure of `artifact-submission/` and provides:

- 🧪 Code snippet collections used to test each library/framework  
- 🎯 Coverage examples for validating rule behavior  

Each dataset folder corresponds directly to a rule folder in `artifact-submission/`.

---

### 📂 `output/`

When rules are executed in the current implementation, their results are written here:

- 📝 Rule evaluation outputs  
- 🔍 Diagnostics and logs  
- 📊 Generated summaries or result bundles  

This folder helps track the outcome of running each of the generated rules.

---

## 🧠 Summary

This repository extends the original MeCheck engine with:

- ✔️ New rules  
- ✔️ Framework-specific datasets  
- ✔️ A runnable rule-generation and evaluation pipeline  

Please check the `MeCheck_GPT_Rule_Generation/README/` folder for detailed execution instructions.
