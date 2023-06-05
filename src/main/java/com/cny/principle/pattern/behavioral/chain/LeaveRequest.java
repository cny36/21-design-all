package com.cny.principle.pattern.behavioral.chain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 请假请求
 *
 * @author : chennengyuan
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LeaveRequest {

    private String name;

    private int num;

    private String reason;
}
