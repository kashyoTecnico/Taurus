import os
import subprocess
from datetime import datetime

# Ruta actual (donde estás parado en PowerShell)
repo_path = r"D:\jadx\bin\output\sources\defpackage"

# URL de tu repo
github_url = "https://github.com/kashyoTecnico/Taurus.git"

def run(cmd):
    subprocess.run(cmd, shell=True, check=True)

os.chdir(repo_path)

# Si no existe .git, inicializa
if not os.path.exists(".git"):
    print("Inicializando repositorio...")
    run("git init")
    run(f"git remote add origin {github_url}")

# Crear .gitignore básico (opcional)
if not os.path.exists(".gitignore"):
    with open(".gitignore", "w") as f:
        f.write("__pycache__/\n*.pyc\n")

print("Agregando archivos...")
run("git add .")

commit_msg = f"Auto upload {datetime.now().strftime('%Y-%m-%d %H:%M:%S')}"
print("Haciendo commit...")
run(f'git commit -m "{commit_msg}"')

print("Subiendo a GitHub...")
run("git branch -M main")
run("git push -u origin main")

print("✔ Listo, todo subido a GitHub.")