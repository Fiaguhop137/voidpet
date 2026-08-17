package Te;

import kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes3.dex */
public enum b {
    ERROR_CLASS("<Error class: %s>"),
    ERROR_FUNCTION("<Error function>"),
    ERROR_SCOPE("<Error scope>"),
    ERROR_MODULE("<Error module>"),
    ERROR_PROPERTY("<Error property>"),
    ERROR_TYPE("[Error type: %s]"),
    PARENT_OF_ERROR_SCOPE("<Fake parent for error lexical scope>");


    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f12459j = Gd.a.a(e());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12460a;

    b(String str) {
        this.f12460a = str;
    }

    public final String g() {
        return this.f12460a;
    }
}
