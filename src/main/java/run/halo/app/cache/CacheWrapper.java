package run.halo.app.cache;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * Cache wrapper.
 *
 * @author johnniang
 */
@Data
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
class CacheWrapper<V> implements Serializable {

    /**
     * 缓存数据
     */
    private V data;

    /**
     * 过期时间
     */
    private Date expireAt;

    /**
     * Create time.
     */
    private Date createAt;
}
