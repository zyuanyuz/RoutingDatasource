package yzy.zyuanyuz.routingdatasource.mapper.one;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author zyuanyuz
 * @since 2019/8/31 15:39
 */
@Mapper
@Component
public interface OneMapper {
  String selectDatabase();
}
