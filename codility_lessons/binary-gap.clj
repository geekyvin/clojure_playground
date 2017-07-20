
(defn get-binary-list [a]
  (map #(- (int %) 48) (seq (Integer/toBinaryString a))))

(defn counter [c a]
  (if (= a 1) 0 (inc c)))

(defn binary-gap [n]
  (apply max (reductions counter 0 (get-binary-list n))))

(binary-gap 15)
  
(binary-gap 4)

(binary-gap 9)

(binary-gap 20)
