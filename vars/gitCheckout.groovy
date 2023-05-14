def call(Map stageparams) {

    checkout([
        $class: 'GitSCM',
        branches:[[name: stageparams.branch]],
        userRemoteConfigs: [[url:stageparams.url]]
    ])
}