pipeline {
    agent any
    tools {
        maven "maven"
    }

    stages {
        stage('Build Maven') {
            steps {
               checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/ajeet-lab/docker-jenkins-k8s-integration.git']])
               sh 'mvn clean install'
              }
        }
        stage('Build Docker') {
            steps {
               sh 'docker build -t ajeet9415/docker-jenkins-k8s-integration:02 .'
              }
        }
        stage('Push image to dockerhub') {
            steps {
                withCredentials([string(credentialsId: 'DOCKER_PASS', variable: 'DOCKER_PASS')]) {
                    sh 'docker login -u ajeet9415k@gmail.com -p ${DOCKER_PASS}'
                }
               sh 'docker push ajeet9415/docker-jenkins-k8s-integration:02'
              }
        }
        
        stage('Deploy') {
            steps {
                kubernetesDeploy (configs: 'deployment.yml', kubeconfigId: 'kubeconfig')
                sh 'kubectl rollout restart deployment docker-jenkins-k8s-deployment'
              }
        }
        
    }
}
