# events
for events
1. Create a folder Extension1 and copy files background.js and manifest.json in the first commit
2. Create another folder Extension2 and copy the rest of the files and paste there.
3. Edit the Registry keys HKEY_LOCAL_MACHINE\SOFTWARE\Google\Chrome\NativeMessagingHosts\com.test.events and value is pathtoExtnsion2folder\manifest.json
4. Enable the developer option in chrome brwoser
5. Add the Chrome extension by using the Load unpacked option and browse till Extensio1 folder
6. Your extension is ready to use
