# GIT usage:

#clone src: git clone https://github.com/vanpk/KLV.git

#initialize git: git init

#change to branchName: git checkout <branchName>
#create branch: git checkout -b <newbranchName> 
  #or: git branch <newbranchName>

#get source: git pull

#to see status: git status

#after changing file (add file): git add 
#or add all file: git add --all

#commit file: git commit -m "<message>"

#push to branch: git push origin

#merge <branchName> into branch master:
git checkout master
git merge <branchName>
  
#know more about GIT, refer to:
https://docs.gitlab.com/ee/gitlab-basics/start-using-git.html
