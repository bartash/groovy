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
        liveHosts.put("d", 4);

        Set<PersonWOConstructor> instances = new HashSet<PersonWOConstructor>();

        def person1 = new PersonWOConstructor(name: 'f')
        def person2 = new PersonWOConstructor(name: 'g')
        def person3 = new PersonWOConstructor(name: 'c')
        def person4 = new PersonWOConstructor(name: 'z')
        def person5 = new PersonWOConstructor(name: 'q')
        def person6 = new PersonWOConstructor(name: 'b')
        instances.add(person1);
        instances.add(person2);
        instances.add(person3);
        instances.add(person4);
        instances.add(person5);
        instances.add(person6);


//        liveHosts.findAll { k, h ->
//            if (k in instances.collect { it.name }) {
//                liveHosts.remove(k)
//            }
//        }

        liveHosts = liveHosts.findAll { k, h ->
            !(k in instances.collect { it.name })
        }

        liveHosts.each {k, h ->
            println("k=" + k + " h=" + h)
        }

    }
}
