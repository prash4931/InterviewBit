def main():
    str_list = ['given', 'intern', 'InterviewBit', 'network', 'local', 'multiple', 'define', 'nodes', 'algorithm', 'allows', 'community', 'phase', 'single']
    my_list = []
    for name in str_list:
        if len(name)%2 != 0:
            my_list.append(name)
    
    print(my_list)
    return 0

if __name__ == '__main__':
    main()
