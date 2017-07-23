
(defn get-binary-list [a]
  (map #(- (int %) 48) (seq (Integer/toBinaryString a))))

(defn counter [c a]
  (if (= a 1) 0 (inc c)))

(defn binary-gap [n]
  (let [r (max (map count (re-seq #"10+(?=1)" (apply str (get-binary-list n)))))]
    (if (empty? r) 0 (dec (first r)))))

(binary-gap 15)

(binary-gap 4)

(binary-gap 9)

(binary-gap 20)

(binary-gap 1041)
