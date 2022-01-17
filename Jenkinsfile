pipeline {
    agent any

    environment {
      hello = "guoch"
      world = "123456"
    }

    stages {
        stage('环境检查') {
            steps {
                sh 'printenv'
                echo "${hello}"
                echo "${world}"
                echo "正在检查基本信息"
                sh 'java -version'
                sh 'git --version'
                sh 'docker version'
            }
        }
        stage('代码编译') {
            steps {
                echo "编译"
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