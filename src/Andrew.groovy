class Andrew {
    static void main(String[] args) {
        print "hello"
        new Andrew().run();
    }

    private Map<String, Integer> liveHosts = new HashMap<>();

    class PersonWOConstructor {
        String name
        Integer age
    }

    void run() {
        println " world"

        liveHosts.put("a", 1);
        liveHosts.put("b", 2);
        liveHosts.put("c", 3);

        Set<PersonWOConstructor> instances = new HashSet<PersonWOConstructor>();

        def person5 = new PersonWOConstructor(name: 'Marie')
        def person6 = new PersonWOConstructor(name: 'b')
        instances.add(person5);
        instances.add(person6);


        liveHosts.findAll { k, h ->
            if (k in instances.collect { it.name }) {
                liveHosts.remove(k)
            }
        }

//        def instList = instances.collect { it.name }
//
//        liveHosts.removeAll { k, h ->
//            k in instances.collect { it.name }
//        }

    }
}
