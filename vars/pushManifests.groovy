def call() {
    sh 'git add .'
    sh 'git commit -m "push Manifests" '
    sh 'git push'
}
