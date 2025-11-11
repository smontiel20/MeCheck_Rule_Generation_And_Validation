# shortest list
0. python version should be 3.10.x-3.12.x
1. download, or use git clone
2. go to the <path>
3. open with git bash (right click on an empty space, click more options, click git bash here)
4. Actice Virtual Environment
```bash
source .venv/Scripts/activate
```

5. Install the Dependencies
```bash
pip install -r requirements.txt
```

6. create a <.env> file, you can rename a txt file or use the command

```bash
vim .env
```
The content should be
```
OPENAI_API_KEY=your_openai_key
SERPAPI_API_KEY=your_serpapi_key
```

7. run
```bash
bash ./run_all.sh
```


# Some quick solutions for errors

1. Use bash, not powershell or cmd
2. If you see "Passed unknown parameter", go to .ipynb and add a parameters tag to the first block.
3. You should not open the file for the current running process.(because it can not overwrite an opened file)
4. to be added
