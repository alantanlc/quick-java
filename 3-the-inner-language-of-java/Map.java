HashMap<String, Integer> phones = new HashMap<>();
phones.put("Joan", 555_1212);

phones.put("Alan", 12345);
phones.putIfAbsent("Alan", 12345);
phones.get("Alan");
phones.getOrDefault("Alan", null);
phones.size();
phones.clear();
phones.remove("Alan");
phones.keySet()

