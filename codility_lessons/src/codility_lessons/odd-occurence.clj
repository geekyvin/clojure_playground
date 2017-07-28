(def A [2 3 4 2 3 4 5])

(frequencies A)

(defn odd-occurence [A]
  (key (reduce #(if (= (val %1) 1) %1 %2) (frequencies A))))

(odd-occurence A)
