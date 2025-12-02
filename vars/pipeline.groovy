def call(Map params = [:]) {

    node(params.agent) {
        try {
            stage("Initial") {
                echo "Hello World... ${params.messages}"
            }
        }
        catch (Exception ex) {
            echo "Exception: ${ex}"
        }
        finally {
            stage("Final") {
                echo "Hello World.... ${params.final_msg}"
            }
        }
    }
}
