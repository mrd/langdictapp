package com.langdict

class DictionaryRepository {

    private val dictionary = listOf(
        // Spanish words
        DictionaryEntry(
            word = "hola",
            language = Language.SPANISH,
            translations = listOf(
                Translation("hello", PartOfSpeech.INTERJECTION, "A greeting or expression of goodwill")
            )
        ),
        DictionaryEntry(
            word = "casa",
            language = Language.SPANISH,
            translations = listOf(
                Translation("house", PartOfSpeech.NOUN, "A building for human habitation"),
                Translation("home", PartOfSpeech.NOUN, "The place where one lives")
            )
        ),
        DictionaryEntry(
            word = "libro",
            language = Language.SPANISH,
            translations = listOf(
                Translation("book", PartOfSpeech.NOUN, "A written or printed work consisting of pages")
            )
        ),
        DictionaryEntry(
            word = "perro",
            language = Language.SPANISH,
            translations = listOf(
                Translation("dog", PartOfSpeech.NOUN, "A domesticated carnivorous mammal")
            )
        ),
        DictionaryEntry(
            word = "gato",
            language = Language.SPANISH,
            translations = listOf(
                Translation("cat", PartOfSpeech.NOUN, "A small domesticated carnivorous mammal"),
                Translation("jack", PartOfSpeech.NOUN, "A mechanical lifting device (car jack)")
            )
        ),
        DictionaryEntry(
            word = "agua",
            language = Language.SPANISH,
            translations = listOf(
                Translation("water", PartOfSpeech.NOUN, "A transparent, odorless liquid essential for life")
            )
        ),
        DictionaryEntry(
            word = "comer",
            language = Language.SPANISH,
            translations = listOf(
                Translation("eat", PartOfSpeech.VERB, "To consume food"),
                Translation("to eat", PartOfSpeech.VERB, "To take food into the mouth and swallow it")
            )
        ),
        DictionaryEntry(
            word = "beber",
            language = Language.SPANISH,
            translations = listOf(
                Translation("drink", PartOfSpeech.VERB, "To consume liquid"),
                Translation("to drink", PartOfSpeech.VERB, "To take liquid into the mouth and swallow")
            )
        ),
        DictionaryEntry(
            word = "grande",
            language = Language.SPANISH,
            translations = listOf(
                Translation("big", PartOfSpeech.ADJECTIVE, "Of considerable size or extent"),
                Translation("large", PartOfSpeech.ADJECTIVE, "Of considerable or relatively great size"),
                Translation("great", PartOfSpeech.ADJECTIVE, "Of an extent, amount, or intensity considerably above normal")
            )
        ),
        DictionaryEntry(
            word = "pequeño",
            language = Language.SPANISH,
            translations = listOf(
                Translation("small", PartOfSpeech.ADJECTIVE, "Of limited size"),
                Translation("little", PartOfSpeech.ADJECTIVE, "Small in size, amount, or degree")
            )
        ),
        DictionaryEntry(
            word = "bueno",
            language = Language.SPANISH,
            translations = listOf(
                Translation("good", PartOfSpeech.ADJECTIVE, "Of high quality or standard"),
                Translation("kind", PartOfSpeech.ADJECTIVE, "Having a friendly, generous nature")
            )
        ),
        DictionaryEntry(
            word = "malo",
            language = Language.SPANISH,
            translations = listOf(
                Translation("bad", PartOfSpeech.ADJECTIVE, "Of poor quality or low standard"),
                Translation("evil", PartOfSpeech.ADJECTIVE, "Profoundly immoral and wicked"),
                Translation("sick", PartOfSpeech.ADJECTIVE, "Not in good health")
            )
        ),
        DictionaryEntry(
            word = "rápido",
            language = Language.SPANISH,
            translations = listOf(
                Translation("fast", PartOfSpeech.ADJECTIVE, "Moving or capable of moving at high speed"),
                Translation("quick", PartOfSpeech.ADJECTIVE, "Moving or functioning rapidly")
            )
        ),
        DictionaryEntry(
            word = "lento",
            language = Language.SPANISH,
            translations = listOf(
                Translation("slow", PartOfSpeech.ADJECTIVE, "Moving or operating at a low speed")
            )
        ),
        DictionaryEntry(
            word = "tiempo",
            language = Language.SPANISH,
            translations = listOf(
                Translation("time", PartOfSpeech.NOUN, "The indefinite continued progress of existence"),
                Translation("weather", PartOfSpeech.NOUN, "The state of the atmosphere at a place and time")
            )
        ),
        DictionaryEntry(
            word = "día",
            language = Language.SPANISH,
            translations = listOf(
                Translation("day", PartOfSpeech.NOUN, "A 24-hour period")
            )
        ),
        DictionaryEntry(
            word = "noche",
            language = Language.SPANISH,
            translations = listOf(
                Translation("night", PartOfSpeech.NOUN, "The period of darkness between sunset and sunrise")
            )
        ),
        DictionaryEntry(
            word = "hombre",
            language = Language.SPANISH,
            translations = listOf(
                Translation("man", PartOfSpeech.NOUN, "An adult male human"),
                Translation("mankind", PartOfSpeech.NOUN, "Human beings collectively")
            )
        ),
        DictionaryEntry(
            word = "mujer",
            language = Language.SPANISH,
            translations = listOf(
                Translation("woman", PartOfSpeech.NOUN, "An adult female human"),
                Translation("wife", PartOfSpeech.NOUN, "A married woman")
            )
        ),
        DictionaryEntry(
            word = "niño",
            language = Language.SPANISH,
            translations = listOf(
                Translation("child", PartOfSpeech.NOUN, "A young human being"),
                Translation("boy", PartOfSpeech.NOUN, "A male child")
            )
        ),
        DictionaryEntry(
            word = "niña",
            language = Language.SPANISH,
            translations = listOf(
                Translation("girl", PartOfSpeech.NOUN, "A female child"),
                Translation("child", PartOfSpeech.NOUN, "A young human being")
            )
        ),
        DictionaryEntry(
            word = "amor",
            language = Language.SPANISH,
            translations = listOf(
                Translation("love", PartOfSpeech.NOUN, "An intense feeling of deep affection")
            )
        ),
        DictionaryEntry(
            word = "vida",
            language = Language.SPANISH,
            translations = listOf(
                Translation("life", PartOfSpeech.NOUN, "The condition that distinguishes living organisms")
            )
        ),
        DictionaryEntry(
            word = "muerte",
            language = Language.SPANISH,
            translations = listOf(
                Translation("death", PartOfSpeech.NOUN, "The end of life")
            )
        ),
        DictionaryEntry(
            word = "hablar",
            language = Language.SPANISH,
            translations = listOf(
                Translation("speak", PartOfSpeech.VERB, "To say words; to talk"),
                Translation("talk", PartOfSpeech.VERB, "To communicate by speaking")
            )
        ),
        DictionaryEntry(
            word = "escuchar",
            language = Language.SPANISH,
            translations = listOf(
                Translation("listen", PartOfSpeech.VERB, "To give attention to sound"),
                Translation("hear", PartOfSpeech.VERB, "To perceive sound with the ear")
            )
        ),
        DictionaryEntry(
            word = "ver",
            language = Language.SPANISH,
            translations = listOf(
                Translation("see", PartOfSpeech.VERB, "To perceive with the eyes"),
                Translation("watch", PartOfSpeech.VERB, "To look at attentively")
            )
        ),
        DictionaryEntry(
            word = "hacer",
            language = Language.SPANISH,
            translations = listOf(
                Translation("do", PartOfSpeech.VERB, "To perform an action"),
                Translation("make", PartOfSpeech.VERB, "To create or produce something")
            )
        ),
        DictionaryEntry(
            word = "tener",
            language = Language.SPANISH,
            translations = listOf(
                Translation("have", PartOfSpeech.VERB, "To possess or own"),
                Translation("to have", PartOfSpeech.VERB, "To possess something")
            )
        ),
        DictionaryEntry(
            word = "ir",
            language = Language.SPANISH,
            translations = listOf(
                Translation("go", PartOfSpeech.VERB, "To move or travel to a place"),
                Translation("to go", PartOfSpeech.VERB, "To proceed to a destination")
            )
        ),
        DictionaryEntry(
            word = "venir",
            language = Language.SPANISH,
            translations = listOf(
                Translation("come", PartOfSpeech.VERB, "To move toward or arrive at a place")
            )
        ),
        DictionaryEntry(
            word = "mesa",
            language = Language.SPANISH,
            translations = listOf(
                Translation("table", PartOfSpeech.NOUN, "A piece of furniture with a flat top and legs")
            )
        ),
        DictionaryEntry(
            word = "silla",
            language = Language.SPANISH,
            translations = listOf(
                Translation("chair", PartOfSpeech.NOUN, "A seat with a back for one person")
            )
        ),
        DictionaryEntry(
            word = "ventana",
            language = Language.SPANISH,
            translations = listOf(
                Translation("window", PartOfSpeech.NOUN, "An opening in a wall with glass to let in light")
            )
        ),
        DictionaryEntry(
            word = "puerta",
            language = Language.SPANISH,
            translations = listOf(
                Translation("door", PartOfSpeech.NOUN, "A movable barrier for opening and closing an entrance"),
                Translation("gate", PartOfSpeech.NOUN, "A hinged barrier at an entrance")
            )
        ),
        DictionaryEntry(
            word = "calle",
            language = Language.SPANISH,
            translations = listOf(
                Translation("street", PartOfSpeech.NOUN, "A public road in a city or town"),
                Translation("road", PartOfSpeech.NOUN, "A way between places for vehicles and people")
            )
        ),
        DictionaryEntry(
            word = "ciudad",
            language = Language.SPANISH,
            translations = listOf(
                Translation("city", PartOfSpeech.NOUN, "A large town")
            )
        ),
        DictionaryEntry(
            word = "país",
            language = Language.SPANISH,
            translations = listOf(
                Translation("country", PartOfSpeech.NOUN, "A nation with its own government")
            )
        ),
        DictionaryEntry(
            word = "mundo",
            language = Language.SPANISH,
            translations = listOf(
                Translation("world", PartOfSpeech.NOUN, "The earth and all its inhabitants")
            )
        ),
        DictionaryEntry(
            word = "sol",
            language = Language.SPANISH,
            translations = listOf(
                Translation("sun", PartOfSpeech.NOUN, "The star around which Earth orbits")
            )
        ),
        DictionaryEntry(
            word = "luna",
            language = Language.SPANISH,
            translations = listOf(
                Translation("moon", PartOfSpeech.NOUN, "Earth's natural satellite")
            )
        ),
        DictionaryEntry(
            word = "estrella",
            language = Language.SPANISH,
            translations = listOf(
                Translation("star", PartOfSpeech.NOUN, "A luminous celestial body")
            )
        ),

        // English words
        DictionaryEntry(
            word = "hello",
            language = Language.ENGLISH,
            translations = listOf(
                Translation("hola", PartOfSpeech.INTERJECTION, "Un saludo o expresión de buena voluntad")
            )
        ),
        DictionaryEntry(
            word = "house",
            language = Language.ENGLISH,
            translations = listOf(
                Translation("casa", PartOfSpeech.NOUN, "Un edificio para habitación humana")
            )
        ),
        DictionaryEntry(
            word = "home",
            language = Language.ENGLISH,
            translations = listOf(
                Translation("casa", PartOfSpeech.NOUN, "El lugar donde uno vive"),
                Translation("hogar", PartOfSpeech.NOUN, "El lugar donde vive una familia")
            )
        ),
        DictionaryEntry(
            word = "book",
            language = Language.ENGLISH,
            translations = listOf(
                Translation("libro", PartOfSpeech.NOUN, "Una obra escrita o impresa que consiste en páginas")
            )
        ),
        DictionaryEntry(
            word = "dog",
            language = Language.ENGLISH,
            translations = listOf(
                Translation("perro", PartOfSpeech.NOUN, "Un mamífero carnívoro domesticado")
            )
        ),
        DictionaryEntry(
            word = "cat",
            language = Language.ENGLISH,
            translations = listOf(
                Translation("gato", PartOfSpeech.NOUN, "Un pequeño mamífero carnívoro domesticado")
            )
        ),
        DictionaryEntry(
            word = "water",
            language = Language.ENGLISH,
            translations = listOf(
                Translation("agua", PartOfSpeech.NOUN, "Un líquido transparente e inodoro esencial para la vida")
            )
        ),
        DictionaryEntry(
            word = "eat",
            language = Language.ENGLISH,
            translations = listOf(
                Translation("comer", PartOfSpeech.VERB, "Consumir alimentos")
            )
        ),
        DictionaryEntry(
            word = "drink",
            language = Language.ENGLISH,
            translations = listOf(
                Translation("beber", PartOfSpeech.VERB, "Consumir líquidos"),
                Translation("bebida", PartOfSpeech.NOUN, "Un líquido para consumir")
            )
        ),
        DictionaryEntry(
            word = "big",
            language = Language.ENGLISH,
            translations = listOf(
                Translation("grande", PartOfSpeech.ADJECTIVE, "De tamaño o extensión considerable")
            )
        ),
        DictionaryEntry(
            word = "large",
            language = Language.ENGLISH,
            translations = listOf(
                Translation("grande", PartOfSpeech.ADJECTIVE, "De tamaño considerable o relativamente grande")
            )
        ),
        DictionaryEntry(
            word = "small",
            language = Language.ENGLISH,
            translations = listOf(
                Translation("pequeño", PartOfSpeech.ADJECTIVE, "De tamaño limitado")
            )
        ),
        DictionaryEntry(
            word = "little",
            language = Language.ENGLISH,
            translations = listOf(
                Translation("pequeño", PartOfSpeech.ADJECTIVE, "Pequeño en tamaño, cantidad o grado"),
                Translation("poco", PartOfSpeech.ADJECTIVE, "Escasa cantidad")
            )
        ),
        DictionaryEntry(
            word = "good",
            language = Language.ENGLISH,
            translations = listOf(
                Translation("bueno", PartOfSpeech.ADJECTIVE, "De alta calidad o estándar")
            )
        ),
        DictionaryEntry(
            word = "bad",
            language = Language.ENGLISH,
            translations = listOf(
                Translation("malo", PartOfSpeech.ADJECTIVE, "De mala calidad o bajo estándar")
            )
        ),
        DictionaryEntry(
            word = "fast",
            language = Language.ENGLISH,
            translations = listOf(
                Translation("rápido", PartOfSpeech.ADJECTIVE, "Que se mueve o puede moverse a alta velocidad")
            )
        ),
        DictionaryEntry(
            word = "slow",
            language = Language.ENGLISH,
            translations = listOf(
                Translation("lento", PartOfSpeech.ADJECTIVE, "Que se mueve u opera a baja velocidad")
            )
        ),
        DictionaryEntry(
            word = "time",
            language = Language.ENGLISH,
            translations = listOf(
                Translation("tiempo", PartOfSpeech.NOUN, "El progreso continuo indefinido de la existencia")
            )
        ),
        DictionaryEntry(
            word = "weather",
            language = Language.ENGLISH,
            translations = listOf(
                Translation("tiempo", PartOfSpeech.NOUN, "El estado de la atmósfera en un lugar y momento"),
                Translation("clima", PartOfSpeech.NOUN, "Las condiciones atmosféricas")
            )
        ),
        DictionaryEntry(
            word = "day",
            language = Language.ENGLISH,
            translations = listOf(
                Translation("día", PartOfSpeech.NOUN, "Un período de 24 horas")
            )
        ),
        DictionaryEntry(
            word = "night",
            language = Language.ENGLISH,
            translations = listOf(
                Translation("noche", PartOfSpeech.NOUN, "El período de oscuridad entre el atardecer y el amanecer")
            )
        ),
        DictionaryEntry(
            word = "man",
            language = Language.ENGLISH,
            translations = listOf(
                Translation("hombre", PartOfSpeech.NOUN, "Un humano masculino adulto")
            )
        ),
        DictionaryEntry(
            word = "woman",
            language = Language.ENGLISH,
            translations = listOf(
                Translation("mujer", PartOfSpeech.NOUN, "Un humano femenino adulto")
            )
        ),
        DictionaryEntry(
            word = "child",
            language = Language.ENGLISH,
            translations = listOf(
                Translation("niño", PartOfSpeech.NOUN, "Un ser humano joven"),
                Translation("niña", PartOfSpeech.NOUN, "Una persona joven"),
                Translation("hijo", PartOfSpeech.NOUN, "Un descendiente")
            )
        ),
        DictionaryEntry(
            word = "boy",
            language = Language.ENGLISH,
            translations = listOf(
                Translation("niño", PartOfSpeech.NOUN, "Un niño masculino"),
                Translation("chico", PartOfSpeech.NOUN, "Un joven masculino")
            )
        ),
        DictionaryEntry(
            word = "girl",
            language = Language.ENGLISH,
            translations = listOf(
                Translation("niña", PartOfSpeech.NOUN, "Una niña femenina"),
                Translation("chica", PartOfSpeech.NOUN, "Una joven femenina")
            )
        ),
        DictionaryEntry(
            word = "love",
            language = Language.ENGLISH,
            translations = listOf(
                Translation("amor", PartOfSpeech.NOUN, "Un sentimiento intenso de afecto profundo"),
                Translation("amar", PartOfSpeech.VERB, "Sentir amor por alguien")
            )
        ),
        DictionaryEntry(
            word = "life",
            language = Language.ENGLISH,
            translations = listOf(
                Translation("vida", PartOfSpeech.NOUN, "La condición que distingue a los organismos vivos")
            )
        ),
        DictionaryEntry(
            word = "death",
            language = Language.ENGLISH,
            translations = listOf(
                Translation("muerte", PartOfSpeech.NOUN, "El fin de la vida")
            )
        ),
        DictionaryEntry(
            word = "speak",
            language = Language.ENGLISH,
            translations = listOf(
                Translation("hablar", PartOfSpeech.VERB, "Decir palabras; comunicarse verbalmente")
            )
        ),
        DictionaryEntry(
            word = "talk",
            language = Language.ENGLISH,
            translations = listOf(
                Translation("hablar", PartOfSpeech.VERB, "Comunicarse hablando"),
                Translation("conversación", PartOfSpeech.NOUN, "Una conversación")
            )
        ),
        DictionaryEntry(
            word = "listen",
            language = Language.ENGLISH,
            translations = listOf(
                Translation("escuchar", PartOfSpeech.VERB, "Prestar atención al sonido")
            )
        ),
        DictionaryEntry(
            word = "see",
            language = Language.ENGLISH,
            translations = listOf(
                Translation("ver", PartOfSpeech.VERB, "Percibir con los ojos")
            )
        ),
        DictionaryEntry(
            word = "watch",
            language = Language.ENGLISH,
            translations = listOf(
                Translation("ver", PartOfSpeech.VERB, "Mirar con atención"),
                Translation("mirar", PartOfSpeech.VERB, "Observar"),
                Translation("reloj", PartOfSpeech.NOUN, "Un dispositivo para medir el tiempo")
            )
        ),
        DictionaryEntry(
            word = "do",
            language = Language.ENGLISH,
            translations = listOf(
                Translation("hacer", PartOfSpeech.VERB, "Realizar una acción")
            )
        ),
        DictionaryEntry(
            word = "make",
            language = Language.ENGLISH,
            translations = listOf(
                Translation("hacer", PartOfSpeech.VERB, "Crear o producir algo")
            )
        ),
        DictionaryEntry(
            word = "have",
            language = Language.ENGLISH,
            translations = listOf(
                Translation("tener", PartOfSpeech.VERB, "Poseer u obtener")
            )
        ),
        DictionaryEntry(
            word = "go",
            language = Language.ENGLISH,
            translations = listOf(
                Translation("ir", PartOfSpeech.VERB, "Moverse o viajar a un lugar")
            )
        ),
        DictionaryEntry(
            word = "come",
            language = Language.ENGLISH,
            translations = listOf(
                Translation("venir", PartOfSpeech.VERB, "Moverse hacia o llegar a un lugar")
            )
        ),
        DictionaryEntry(
            word = "table",
            language = Language.ENGLISH,
            translations = listOf(
                Translation("mesa", PartOfSpeech.NOUN, "Un mueble con una superficie plana y patas")
            )
        ),
        DictionaryEntry(
            word = "chair",
            language = Language.ENGLISH,
            translations = listOf(
                Translation("silla", PartOfSpeech.NOUN, "Un asiento con respaldo para una persona")
            )
        ),
        DictionaryEntry(
            word = "window",
            language = Language.ENGLISH,
            translations = listOf(
                Translation("ventana", PartOfSpeech.NOUN, "Una abertura en una pared con vidrio para dejar entrar luz")
            )
        ),
        DictionaryEntry(
            word = "door",
            language = Language.ENGLISH,
            translations = listOf(
                Translation("puerta", PartOfSpeech.NOUN, "Una barrera móvil para abrir y cerrar una entrada")
            )
        ),
        DictionaryEntry(
            word = "street",
            language = Language.ENGLISH,
            translations = listOf(
                Translation("calle", PartOfSpeech.NOUN, "Una vía pública en una ciudad o pueblo")
            )
        ),
        DictionaryEntry(
            word = "city",
            language = Language.ENGLISH,
            translations = listOf(
                Translation("ciudad", PartOfSpeech.NOUN, "Una población grande")
            )
        ),
        DictionaryEntry(
            word = "country",
            language = Language.ENGLISH,
            translations = listOf(
                Translation("país", PartOfSpeech.NOUN, "Una nación con su propio gobierno"),
                Translation("campo", PartOfSpeech.NOUN, "Área rural fuera de las ciudades")
            )
        ),
        DictionaryEntry(
            word = "world",
            language = Language.ENGLISH,
            translations = listOf(
                Translation("mundo", PartOfSpeech.NOUN, "La Tierra y todos sus habitantes")
            )
        ),
        DictionaryEntry(
            word = "sun",
            language = Language.ENGLISH,
            translations = listOf(
                Translation("sol", PartOfSpeech.NOUN, "La estrella alrededor de la cual orbita la Tierra")
            )
        ),
        DictionaryEntry(
            word = "moon",
            language = Language.ENGLISH,
            translations = listOf(
                Translation("luna", PartOfSpeech.NOUN, "El satélite natural de la Tierra")
            )
        ),
        DictionaryEntry(
            word = "star",
            language = Language.ENGLISH,
            translations = listOf(
                Translation("estrella", PartOfSpeech.NOUN, "Un cuerpo celeste luminoso")
            )
        )
    )

    fun search(query: String): List<DictionaryEntry> {
        val normalizedQuery = query.trim().lowercase()
        return dictionary.filter {
            it.word.lowercase().contains(normalizedQuery)
        }
    }
}
