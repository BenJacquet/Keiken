## 1. How is permission granted to delete a file?

The system checks if the user has the correct permissions to delete a file by reading the parent directory's sticky bit, then deletes it if the conditions are met.

## 2. Create a file that your colleague can edit but not delete and another he can delete but not edit

```
touch first && chmod o+trw first
```

```
touch second && chmod o-tw second (The user must have read, write and execute permission on the directory).
```

## 3. Does it make sense to be able to assign such rights?

In my opinion both of these rights combinations of rights don't really make sense because:

- If the user can edit a file they can empty its content, making it useless except in the case of a program only needing its existence.
- If the user can delete a file, it would make no sense to restrict write access except to prevent malicious code injection that could be executed with that file.

For other, less particuliar permissions, such as providing different access levels to group and others is really important as it allows to manage permissions on specific files without giving too much permissions (for example by giving root access). It also allows faster management as you can change permissions for an entire group instead of a single user by combining chmod with chgroup and or usermod -a -G.

## 4. What are the practical consequences of this experience?

See previous answers, but moreover, I discovered that directories permissions and particulary the sticky bit are the determining factors for file deletion.
