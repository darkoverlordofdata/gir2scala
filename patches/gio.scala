    @js.native
    object File extends GObject.Object {
        def new_for_path(path: String): File = js.native
    }
    @js.native
    class File extends GObject.Object {
        def query_exists(obj:Any): Boolean = js.native
        def load_contents(obj:Any): Any = js.native
        def make_directory(obj:Any): Boolean = js.native
        def delete(obj:Any): Boolean = js.native
        def create(flags:Any, obj: Any): Any = js.native
    }
