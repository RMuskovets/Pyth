#! /usr/bin/env python3

num = input('Enter number: ')
sum = 0
for ch in list(num):
	try:
		sum += int(ch)
	except ValueError:
		print ('Error: the character \'{ch}\' isn\'t valid.'.format(ch=ch))
		import sys
		sys.exit()
print ('The sum is: {sum}'.format(sum=sum))