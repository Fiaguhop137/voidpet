package kotlin.reflect;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface c extends b {
    Object call(Object... objArr);

    Object callBy(Map map);

    String getName();

    List getParameters();

    o getReturnType();

    List getTypeParameters();

    r getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
