# Shadow-cljs error repro

```
npm run test
```


results:

```
> test
> shadow-cljs compile test && node target/main/node-tests.js;

shadow-cljs - config: /Users/sritchie/code/clj/repro/shadow-cljs.edn
shadow-cljs - socket connect failed, server process dead?
shadow-cljs - starting via "clojure"
[:test] Compiling ...
[:test] Build completed. (173 files, 118 compiled, 0 warnings, 5.75s)
no "source-map-support" (run "npm install source-map-support --save-dev" to get it)
SHADOW import error /Users/sritchie/code/clj/repro/.shadow-cljs/builds/test/dev/out/cljs-runtime/shadow.js.shim.module$markdown_it.js
/Users/sritchie/code/clj/repro/target/main/node-tests.js:67
    throw e;
    ^

Error: Cannot find module 'markdown-it'
Require stack:
- /Users/sritchie/code/clj/repro/target/main/node-tests.js
    at Function.Module._resolveFilename (node:internal/modules/cjs/loader:985:15)
    at Function.Module._load (node:internal/modules/cjs/loader:833:27)
    at Module.require (node:internal/modules/cjs/loader:1057:19)
    at require (node:internal/modules/cjs/helpers:103:18)
    at /Users/sritchie/code/clj/repro/.shadow-cljs/builds/test/dev/out/cljs-runtime/shadow.js.shim.module$markdown_it.js:3:37
    at global.SHADOW_IMPORT (/Users/sritchie/code/clj/repro/target/main/node-tests.js:64:44)
    at /Users/sritchie/code/clj/repro/target/main/node-tests.js:1460:1
    at Object.<anonymous> (/Users/sritchie/code/clj/repro/target/main/node-tests.js:1524:3)
    at Module._compile (node:internal/modules/cjs/loader:1155:14)
    at Object.Module._extensions..js (node:internal/modules/cjs/loader:1209:10) {
  code: 'MODULE_NOT_FOUND',
  requireStack: [ '/Users/sritchie/code/clj/repro/target/main/node-tests.js' ]
```
