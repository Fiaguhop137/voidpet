package G6;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX WARN: Method from annotation default annotation not found: hasConstants */
/* JADX INFO: loaded from: classes2.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface a {
    boolean canOverrideExistingModule() default false;

    boolean isCxxModule() default false;

    String name();

    boolean needsEagerInit() default false;
}
