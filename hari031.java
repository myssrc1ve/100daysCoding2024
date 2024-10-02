# Konversi string ke int
string_int = "123"
converted_int = int(string_int)
print(f"String ke int: {converted_int} (Tipe: {type(converted_int)})")

# Konversi string ke float
string_float = "123.45"
converted_float = float(string_float)
print(f"String ke float: {converted_float} (Tipe: {type(converted_float)})")

# Konversi string ke bool
string_bool_true = "True"
string_bool_false = "False"
converted_bool_true = string_bool_true.lower() == 'true'
converted_bool_false = string_bool_false.lower() == 'true'
print(f"String ke bool (True): {converted_bool_true} (Tipe: {type(converted_bool_true)})")
print(f"String ke bool (False): {converted_bool_false} (Tipe: {type(converted_bool_false)})")
