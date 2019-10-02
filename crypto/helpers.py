def alphabet_position(letter):
  alphabet = "abcdefghijklmnopqrstuvwxyz"
  position = alphabet.index(letter.lower())
  return position


def rotate_char(char, rot):
  if not (char.isalpha()):
       return char

  else:
       alphabet = "abcdefghijklmnopqrstuvwxyz"
       new_value = (alphabet_position(char) + rot) % 26
       if char.isupper():
           new_letter = alphabet[new_value].upper()
       else:
           new_letter = alphabet[new_value]
       return new_letter
