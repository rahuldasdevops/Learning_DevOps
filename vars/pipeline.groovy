def call{
	try{
		pipeline{
			agent{
				label "master"
			}
			stages{
				stage("Initial"){
					steps{
						echo "Hello World... "
					}
				}
			}
		}
	}
	catch(Exception ex){
		println "Exception: $ex"
	}
	finally{
        echo "Hello World....Endgame"
	}
}
