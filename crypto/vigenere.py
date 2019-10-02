from helpers import alphabet_position, rotate_char

def encrypt(text, key):
  alphabet = "abcdefghijklmnopqrstuvwxyz"
  message = ""
  encrypted = []    
  starting_index = 0
  for char in text:
    if char.isalpha():
        rot = alphabet_position(key[starting_index%len(key)])
        message += rotate_char(char,rot)
        starting_index += 1
    else:
      message += char
  return message

def main():                      
    text = input("Enter some text:")
    key = input("Enter a key:")

    print(encrypt(text,key))
if __name__ == "__main__":
    main()

