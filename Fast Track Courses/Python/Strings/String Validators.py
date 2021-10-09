def main():
    S = input()
    #Your code goes here
    alnm = 'False'
    alp = 'False'
    dig = 'False'
    low = 'False'
    upp = 'False'
    for i in S:
        if i.isalnum():
            alnm = 'True'
        if i.isalpha():
            alp = 'True'
        if i.isdigit():
            dig = 'True'
        if i.islower():
            low = 'True'
        if i.isupper():
            upp = 'True'
    print(alnm + '\n'+ alp + '\n'+dig + '\n'+ low+ '\n'+upp)
    return 0

if __name__ == '__main__':
    main()
