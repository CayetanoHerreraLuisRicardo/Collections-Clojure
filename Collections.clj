(def lista01
	(quote (10 20 30 40)))
	
(def lista02
	'(10 20 30 40))
	
(def lista03
	'(40 30 20 10))
	
(def lista04
	'(+ -  * /))
	
(def lista05
	'(":a" ":b" ":c" ":d"))
	
(def lista06
	'(1/4 1/2 3/4 4/4))
	
(def lista07
	'((def [x] (* x x)) (def [x] (+ x x))))

(def vector01
     [10 20 30 40])
	 
(def mapa01
     {:a 10 :b 20 :c 30 :d 40})
	 
(def conjunto01
     #{10 20 30 40})
	 
(def listota
     '([10 20 30 40]
     {:a 10 :b 20 :c 30 :d 40}
     #{[4 3] [2 1] [0 0]}))
	 
(def vectorsote
     [lista01 vector01 mapa01 conjunto01])
	 
(def mapota
     {
       :semana ["Lunes" "Martes" "Miercoles" "Jueves" "Viernes" "Sabado"]
       [10 20 30 40] [50 60 70 80]
	   

	
