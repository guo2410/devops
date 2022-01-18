pipeline {
    agent any

    environment {
      hello = "guoch"
      world = "123456"
    }

    stages {
        stage('环境检查') {

            agent {
                docker { image 'maven:3-alpine'}
            }

            steps {
                sh 'printenv'
                echo "${hello}"
                echo "${world}"
                echo "正在检查基本信息"
                sh 'docker version'
                sh 'mvn -v'
            }
        }
        stage('代码编译') {
            steps {
                echo "编译"
                sh 'java -version'
                sh 'git --version'
            }
        }
        stage('代码测试') {
            steps {
                echo('测试')
            }
        }
        stage('代码打包') {
            steps {
                echo('打包')
            }
        }
        stage('代码部署') {
            steps {
                echo('部署')
            }
        }
    }
}