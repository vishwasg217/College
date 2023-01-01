a = "vishwasgowda"
b = "good"

a = a[:len(a)//2] + b + a[len(a)//2:]
print("vishwas gowda".startswith("vish"))
print("vishwas gowda".endswith("da"))

print("vishwas gowda".split())
print("vishwas gowda".rjust(50, "*"))
print("   vishwas gowda    ".strip("as"))
print(", ".join(["apple", "grapes", "mango"]))



print(a)