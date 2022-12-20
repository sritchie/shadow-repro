(ns repro)

(defn run []
  (let [f (memoize identity)]
    (f (list 'a (list 'b (js/BigInt -12) 'c (list 'd)) 'e))
    (f 'a)
    (f (list 'b (js/BigInt -12) 'c (list 'd)) 'e)
    (f 'b)
    (f (js/BigInt -12))
    (f 'c)
    (f (list 'd))
    (f 'd)
    (f 'e)))

(run)
