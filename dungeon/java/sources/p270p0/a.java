package p270p0;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final void a(@NotNull String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void b(@NotNull String str) {
        throw new IllegalStateException(str);
    }

    @NotNull
    public static final Void c(@NotNull String str) {
        throw new IllegalStateException(str);
    }
}
