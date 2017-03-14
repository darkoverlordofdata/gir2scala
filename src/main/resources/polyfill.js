/**
 * Gjs polyfills for scalaJs
 */
Object.defineProperties(window, {
    /**
     * Gjs doesn't have a global, just window. Yet there is no gui window, just command line.
     * This is backwards from other engines, and from what scala.js expects.
     * Easy to fix, global is just an alias for window.
     */
    global: {value: window},
    /**
     * console.log / console.error 
     * used by print/println/etc
     */
    console: { value: {
            log: function() {print.apply(null, arguments);},
            error: function() {printerr.apply(null, arguments);}
        }
    }
});
