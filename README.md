# shadow-repro

Build the JS:

```
shadow-cljs watch repro
```

Then open `repro.html`. You'll see this in the console.

```cljs
Uncaught TypeError: Cannot create property 'closure_uid_21581550' on bigint '-12'
    at goog.getUid (cljs_env.js:392:127)
    at core.cljs:1436:6
    at cljs$core$IHash$_hash$dyn_28715 (core.cljs:724:1)
    at Object.cljs$core$_hash [as _hash] (core.cljs:724:1)
    at Object.cljs$core$hash [as hash] (core.cljs:1036:15)
    at Object.cljs$core$hash_ordered_coll [as hash_ordered_coll] (core.cljs:1360:54)
    at Object.cljs$core$IHash$_hash$arity$1 (core.cljs:3133:36)
    at Object.cljs$core$hash [as hash] (core.cljs:1008:21)
    at Object.cljs$core$hash_ordered_coll [as hash_ordered_coll] (core.cljs:1360:54)
    at Object.cljs$core$IHash$_hash$arity$1 (core.cljs:3133:36)
goog.getUid @ cljs_env.js:392
(anonymous) @ core.cljs:1436
cljs$core$IHash$_hash$dyn_28715 @ core.cljs:724
cljs$core$_hash @ core.cljs:724
cljs$core$hash @ core.cljs:1036
cljs$core$hash_ordered_coll @ core.cljs:1360
(anonymous) @ core.cljs:3133
cljs$core$hash @ core.cljs:1008
cljs$core$hash_ordered_coll @ core.cljs:1360
(anonymous) @ core.cljs:3133
cljs$core$hash @ core.cljs:1008
cljs$core$hash_ordered_coll @ core.cljs:1360
(anonymous) @ core.cljs:1667
cljs$core$hash @ core.cljs:1008
(anonymous) @ core.cljs:8200
(anonymous) @ core.cljs:8172
(anonymous) @ core.cljs:8261
cljs$core$_conj_BANG_ @ core.cljs:803
(anonymous) @ core.cljs:2532
(anonymous) @ core.cljs:2532
(anonymous) @ core.cljs:7025
(anonymous) @ core.cljs:2570
(anonymous) @ core.cljs:5266
(anonymous) @ core.cljs:6971
(anonymous) @ core.cljs:2005
(anonymous) @ core.cljs:4559
(anonymous) @ core.cljs:4559
G__33093__delegate @ core.cljs:11095
G__33093 @ core.cljs:11091
repro$run @ repro.cljs:13
(anonymous) @ repro.cljs:15
```

This is really finicky. Commenting out ANY of the lines removes the error!
