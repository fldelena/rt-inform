class TaskOnGroovy {
    static def valueCounter(List list){
        def map = list.collectEntries(){
            [(it):list.count(it)]
        }
    }
}
