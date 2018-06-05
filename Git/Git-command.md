# Git - command

## Init

### `git init`

* .git文件夹追踪管理版本库

## Add

### `git add [filename]`

* `.` for all file
* `.gitignore` file to list the ignored files.

### `git commit`

* `-m "There is a commit"`
* `-a`
  * skip the staging step
  * Untracked files should add manually

## Look

### `git status`

### `git log`

* `--pretty=oneline` -- format
* recently 3 times commit log
* commit id is `SHA1`

## Branch control

### `git branch [branch-name]`

* new branch

### `git checkout [branch-name]`

* switch branch (and the files do, too)

### `git merge [source-branch-name]`

* automatically mark the conflict in the files

### `git mergetool`

* other software to solve the conflict

### `git stash`

### `git stash apply`

* no commit change will exist in branch switch
* to save the dirty stage

## Remote Repository

### `git remote`

* entry for origin
* `-v` showing the URLs
* //list the remote repository

### `git clone [http/shh]`

### `git fetch origin`

* not auto merge

### `git pull origin`

* auto

### `git push origin [branch-name]`

### `git remote add [branch] URLs`

* ???