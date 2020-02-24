# KLV
To summarize, here are the commands to create a new branch, make some commits, and merge it back into master:
$ git checkout master
$ git branch new-branch
$ git checkout new-branch

# ...develop some code...

$ git add –A
$ git commit –m "Some commit message"
$ git checkout master
$ git merge new-branch
