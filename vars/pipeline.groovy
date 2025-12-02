def call(Map params){
	try{
		pipeline{
			agent{
				label "${params.agent}"
			}
			stages{
				stage("Initial"){
					steps{
						echo "Hello World... ${params.messages}"
					}
				}
			}
		}
	}
	catch(Exception ex){
		println "Exception: $ex"
	}
	finally{
        echo "Hello World.... ${params.final_msg}"
	}
}
