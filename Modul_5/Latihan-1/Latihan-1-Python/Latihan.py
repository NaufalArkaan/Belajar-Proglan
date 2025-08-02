data = [
    ("Andi", "11119", 1),
    ("Bima", "11112", 1),
    ("Rahma", "11131", 3),
    ("Zeno", "11198", 9),
    ("Rahma", "11131", 3),
    ("Andi", "11119", 1)
]

unique_data = list(set(data))

unique_data.sort(key=lambda x: x[0])

with open("data.txt", "w") as file:
    file.write("Nama,NIM,Semester\n")
    for row in unique_data:
        file.write(f"{row[0]},{row[1]},{row[2]}\n")
print("Data berhasil ditambahkan.")