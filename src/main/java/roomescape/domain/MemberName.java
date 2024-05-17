package roomescape.domain;

import io.micrometer.common.util.StringUtils;
import jakarta.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class MemberName {

    private static final int MAX_NAME_SIZE = 10;

    private String name;

    public MemberName() {
    }

    public MemberName(String name) {
        validate(name);
        this.name = name;
    }


    private void validate(String value) {
        if (StringUtils.isBlank(value) || value.length() > MAX_NAME_SIZE) {
            throw new IllegalArgumentException(value + " 사용자 이름 1글자 이상 10글자 이하를 입력해주세요.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MemberName that = (MemberName) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
