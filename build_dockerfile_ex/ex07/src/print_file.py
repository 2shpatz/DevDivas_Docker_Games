import sys

if len(sys.argv) != 2:
    print("Usage: python print_file.py <file_path>")
    sys.exit(1)

file_path = sys.argv[1]

try:
    with open(file_path, 'r') as file:
        print(file.read())
except Exception as e:
    print(f"Error reading file: {e}")

