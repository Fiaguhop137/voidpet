package androidx.compose.ui.draw;

import V.k;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final k a(k kVar, Function1 function1) {
        return kVar.then(new DrawBehindElement(function1));
    }
}
