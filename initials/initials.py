def get_initials(fullname):

  alex = fullname.split(" ")
  initials = ""
  for name in alex:
      initials += name[0].upper()
  return (initials)
  #return friends
def main():
    user_name=input("What is your name?")
    user_inits = get_initials(user_name)
    print(user_name, "Your initials are", user_inits)
if __name__ == "__main__":
   main()
       