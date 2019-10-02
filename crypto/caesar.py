
from helpers import alphabet_position, rotate_char

def encrypt (text, rot):
    encrypted_text = ""
    for characters in text:
        encrypted_text += rotate_char(characters, rot)
    return encrypted_text
 
def main():
    text = input('Enter your message: ')
    rotation = int(input('Enter rotation: '))
    print(encrypt(text, rotation))

if __name__ == "__main__":
    main()