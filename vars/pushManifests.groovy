def call() {
    git config --global user.email "hadeeralaa542@gmail.con"
    git config --global user.name "hadeer"
    sh 'git add .'
    sh 'git commit -m "push Manifests" '
    sh 'git push'
}
