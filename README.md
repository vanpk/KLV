# GIT usage:

#clone src: git clone https://github.com/vanpk/KLV.git

#initialize git: git init

#create branch: git checkout -b

#get source: git pull

#to see status: git status

#after changing file (add file): git add #or add all file: git add --all

#commit file: git commit -m ""

#push to branch: git push origin

#to know more on GIT, refer to https://github.com/joshnh/Git-Commands or google more.

-----------------------------------
2. To create a new branch, make some commits, and merge it back into master:
$ git checkout master
$ git branch new-branch
$ git checkout new-branch


$ git add –A
$ git commit –m "Some commit message"
$ git checkout master
$ git merge new-branch
