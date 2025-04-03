def call() {
    sh 'git config --global user.email "hadeeralaa542@gmail.com" '
    sh 'git config --global user.name "hadeer" '
    sh 'git add .'
    sh 'git commit -m "push Manifests" '
    sh 'git push'
}
